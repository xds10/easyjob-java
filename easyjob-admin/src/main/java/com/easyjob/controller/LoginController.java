package com.easyjob.controller;
import com.easyjob.entity.constants.Constants;
import com.easyjob.entity.enums.ResponseCodeEnum;
import com.easyjob.entity.enums.SysAccountStatusEnum;
import com.easyjob.entity.po.SysAccount;
import com.easyjob.entity.vo.ResponseVO;
import com.easyjob.exception.BusinessException;
import com.easyjob.service.SysAccountService;
import com.easyjob.utils.ImageVerifyCodeGenerator;
import com.easyjob.utils.StringTools;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

@RestController
public class LoginController extends ABaseController{

    @Resource
    private SysAccountService sysAccountService;

    @RequestMapping("/checkCode")
    public void verifyCode(HttpSession session, HttpServletResponse response) throws IOException {
        // 生成验证码图片
        Map<String, Object> imageVerifyCode = ImageVerifyCodeGenerator.generate();
        BufferedImage bfm = (BufferedImage) imageVerifyCode.get("image");
        String code = String.valueOf(imageVerifyCode.get("code"));
        System.out.println("验证码:" + code);
        //HttpSession session = request.getSession();
        session.setAttribute(Constants.CHECK_CODE_KEY, code);
        // 使用 ImageIO工具类将 图片验证码输出到响应流
        ImageIO.write(bfm, "PNG", response.getOutputStream());


    }
    @RequestMapping("/login")
    public ResponseVO login(HttpSession session, String phone,String password, String checkCode){

        if(StringTools.isEmpty(phone)||StringTools.isEmpty(password)||StringTools.isEmpty(checkCode)){
            throw new BusinessException(ResponseCodeEnum.CODE_600);
        }
        if(!checkCode.equalsIgnoreCase((String) session.getAttribute(Constants.CHECK_CODE_KEY))){
            throw new BusinessException("图片验证码错误");
        }
        sysAccountService.login(phone, password);
        return getSuccessResponseVO(null);
    }

}
