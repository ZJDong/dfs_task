/*
 * $RCSfile: UserQueryListTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.admin.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.skin.finder.security.User;


/**
 * <p>Title: UserQueryListTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class UserQueryListTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final UserQueryListTemplate instance = new UserQueryListTemplate();


    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public static void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        instance.service(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        OutputStream out = response.getOutputStream();


    @SuppressWarnings("unchecked")
    List<User> userList = (List<User>)(request.getAttribute("userList"));

        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        out.write(_jsp_string_11, 0, _jsp_string_11.length);
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        out.write(_jsp_string_13, 0, _jsp_string_13.length);
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        out.write(_jsp_string_15, 0, _jsp_string_15.length);
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        out.write(_jsp_string_17, 0, _jsp_string_17.length);
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        out.write(_jsp_string_19, 0, _jsp_string_19.length);
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        out.write(_jsp_string_21, 0, _jsp_string_21.length);
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        out.write(_jsp_string_23, 0, _jsp_string_23.length);
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        out.write(_jsp_string_25, 0, _jsp_string_25.length);
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        out.write(_jsp_string_27, 0, _jsp_string_27.length);
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        out.write(_jsp_string_29, 0, _jsp_string_29.length);
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        out.write(_jsp_string_33, 0, _jsp_string_33.length);
        out.write(_jsp_string_34, 0, _jsp_string_34.length);
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        out.write(_jsp_string_36, 0, _jsp_string_36.length);
        this.write(out, request.getAttribute("userName"));
        out.write(_jsp_string_38, 0, _jsp_string_38.length);
        out.write(_jsp_string_39, 0, _jsp_string_39.length);
        out.write(_jsp_string_40, 0, _jsp_string_40.length);

            if(userList != null && userList.size() > 0) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for(User user : userList) {
        
        out.write(_jsp_string_42, 0, _jsp_string_42.length);
        this.write(out, (user.getUserName()));
        out.write(_jsp_string_44, 0, _jsp_string_44.length);
        this.write(out, (user.getUserName()));
        out.write(_jsp_string_46, 0, _jsp_string_46.length);
        this.write(out, (dateFormat.format(user.getCreateTime())));
        out.write(_jsp_string_48, 0, _jsp_string_48.length);
        this.write(out, (user.getUserName()));
        out.write(_jsp_string_50, 0, _jsp_string_50.length);
        this.write(out, (user.getUserName()));
        out.write(_jsp_string_52, 0, _jsp_string_52.length);
        this.write(out, (user.getUserName()));
        out.write(_jsp_string_54, 0, _jsp_string_54.length);

                }
            }
        
        out.write(_jsp_string_56, 0, _jsp_string_56.length);

        if(userList == null || userList.size() < 1) {
    
        out.write(_jsp_string_58, 0, _jsp_string_58.length);

        }
    
        out.write(_jsp_string_60, 0, _jsp_string_60.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_6 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_7 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_8 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Finder - Powered by Finder</title>\r\n");
    protected static final byte[] _jsp_string_9 = b("<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_10 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/admin/css/form.css\"/>\r\n");
    protected static final byte[] _jsp_string_11 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_12 = b("<script type=\"text/javascript\" src=\"?action=res&path=/admin/base.js\"></script>\r\n");
    protected static final byte[] _jsp_string_13 = b("<script type=\"text/javascript\">\r\n<!--\r\njQuery(function() {\r\n    jQuery(\"input[name=query]\").click(function() {\r\n");
    protected static final byte[] _jsp_string_14 = b("        var userName = jQuery.trim(jQuery(\"input[name=userName]\").val());\r\n\r\n        if(userName.length < 1) {\r\n");
    protected static final byte[] _jsp_string_15 = b("            alert(\"用户名不能为空！\");\r\n            return;\r\n        }\r\n        window.location.href = \"?action=admin.user.query&userName=\" + encodeURIComponent(userName);\r\n");
    protected static final byte[] _jsp_string_16 = b("    });\r\n\r\n    jQuery(\"table tr td a.delete\").click(function() {\r\n        var userName = this.getAttribute(\"userName\");\r\n");
    protected static final byte[] _jsp_string_17 = b("\r\n        if(!window.confirm(\"删除之后不可恢复，确定要删除 [\" + userName + \"] 吗？\")) {\r\n            return;\r\n");
    protected static final byte[] _jsp_string_18 = b("        }\r\n\r\n        jQuery.ajax({\r\n            \"type\": \"get\",\r\n            \"url\": \"?action=admin.user.delete&userName=\" + encodeURIComponent(userName),\r\n");
    protected static final byte[] _jsp_string_19 = b("            \"dataType\": \"json\",\r\n            \"error\": function() {\r\n                alert(\"系统错误，请稍后再试！\");\r\n");
    protected static final byte[] _jsp_string_20 = b("            },\r\n            \"success\": function(response) {\r\n                if(response.status != 200) {\r\n");
    protected static final byte[] _jsp_string_21 = b("                    alert(response.message);\r\n                    return;\r\n                }\r\n");
    protected static final byte[] _jsp_string_22 = b("                window.location.reload();\r\n            }\r\n        });\r\n    });\r\n");
    protected static final byte[] _jsp_string_23 = b("\r\n    jQuery(\"table tr td a.as-admin\").click(function() {\r\n        var userName = this.getAttribute(\"userName\");\r\n");
    protected static final byte[] _jsp_string_24 = b("\r\n        if(!window.confirm(\"管理员只能有一个，设置为管理员后之前的管理员将降为普通用户，确定继续吗？\")) {\r\n            return;\r\n");
    protected static final byte[] _jsp_string_25 = b("        }\r\n\r\n        jQuery.ajax({\r\n            \"type\": \"get\",\r\n            \"url\": \"?action=admin.user.asadmin&userName=\" + encodeURIComponent(userName),\r\n");
    protected static final byte[] _jsp_string_26 = b("            \"dataType\": \"json\",\r\n            \"error\": function() {\r\n                alert(\"系统错误，请稍后再试！\");\r\n");
    protected static final byte[] _jsp_string_27 = b("            },\r\n            \"success\": function(response) {\r\n                if(response.status != 200) {\r\n");
    protected static final byte[] _jsp_string_28 = b("                    alert(response.message);\r\n                    return;\r\n                }\r\n");
    protected static final byte[] _jsp_string_29 = b("                window.location.reload();\r\n            }\r\n        });\r\n    });\r\n");
    protected static final byte[] _jsp_string_30 = b("});\r\n//-->\r\n</script>\r\n</head>\r\n<body contextPath=\"");
    protected static final byte[] _jsp_string_32 = b("\">\r\n<div class=\"menu-bar\">\r\n    <a class=\"button\" href=\"javascript:void(0)\" onclick=\"window.history.back();\"><span class=\"back\"></span>返回</a>\r\n");
    protected static final byte[] _jsp_string_33 = b("    <a class=\"button\" href=\"javascript:void(0)\" onclick=\"window.location.reload();\"><span class=\"refresh\"></span>刷新</a>\r\n");
    protected static final byte[] _jsp_string_34 = b("    <span class=\"seperator\"></span>\r\n</div>\r\n<div class=\"form\">\r\n    <div class=\"title\"><h4>查询用户</h4></div>\r\n");
    protected static final byte[] _jsp_string_35 = b("    <div style=\"margin: 10px 0px; font-size: 13px;\">请先输入用户名查询用户:</div>\r\n    <div style=\"margin: 10px 0px;\">\r\n");
    protected static final byte[] _jsp_string_36 = b("        <input name=\"userName\" type=\"text\" class=\"text w200\" placeholder=\"User Name\" value=\"");
    protected static final byte[] _jsp_string_38 = b("\"/>\r\n        <input name=\"query\" type=\"button\" class=\"button\" value=\"查询\"/>\r\n    </div>\r\n");
    protected static final byte[] _jsp_string_39 = b("    <table id=\"host-table\" class=\"list\">\r\n        <tr class=\"head\">\r\n            <td>用户名</td>\r\n");
    protected static final byte[] _jsp_string_40 = b("            <td>注册时间</td>\r\n            <td>操作</td>\r\n        </tr>\r\n        ");
    protected static final byte[] _jsp_string_42 = b("        <tr userName=\"");
    protected static final byte[] _jsp_string_44 = b("\">\r\n            <td class=\"w200\">");
    protected static final byte[] _jsp_string_46 = b("</td>\r\n            <td class=\"w400\">");
    protected static final byte[] _jsp_string_48 = b("</td>\r\n            <td>\r\n                <a class=\"btn\" href=\"?action=admin.user.edit&userName=");
    protected static final byte[] _jsp_string_50 = b("\">修改</a>\r\n                <a class=\"btn delete\" href=\"javascript:void(0)\" userName=\"");
    protected static final byte[] _jsp_string_52 = b("\">刪除</a>\r\n                <a class=\"btn as-admin\" href=\"javascript:void(0)\" userName=\"");
    protected static final byte[] _jsp_string_54 = b("\">设置为管理员</a>\r\n            </td>\r\n        </tr>\r\n        ");
    protected static final byte[] _jsp_string_56 = b("    </table>\r\n    ");
    protected static final byte[] _jsp_string_58 = b("    <div style=\"margin: 10px 0px;\">无查询条件或者无数据。</div>\r\n    ");
    protected static final byte[] _jsp_string_60 = b("</div>\r\n<div id=\"pageContext\" style=\"display: none;\"></div>\r\n</body>\r\n</html>\r\n");

}
