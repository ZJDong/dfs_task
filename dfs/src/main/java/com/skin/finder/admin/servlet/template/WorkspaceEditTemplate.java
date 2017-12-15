/*
 * $RCSfile: WorkspaceEditTemplate.java,v $
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

import com.skin.finder.cluster.Workspace;


/**
 * <p>Title: WorkspaceEditTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class WorkspaceEditTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final WorkspaceEditTemplate instance = new WorkspaceEditTemplate();


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


    Workspace workspace = (Workspace)(request.getAttribute("workspace"));

    if(workspace == null) {
        workspace = new Workspace();
    }

        out.write(_jsp_string_3, 0, _jsp_string_3.length);
        out.write(_jsp_string_4, 0, _jsp_string_4.length);
        out.write(_jsp_string_5, 0, _jsp_string_5.length);
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
        out.write(_jsp_string_31, 0, _jsp_string_31.length);
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        out.write(_jsp_string_33, 0, _jsp_string_33.length);
        this.write(out, request.getAttribute("hostName"));
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        out.write(_jsp_string_36, 0, _jsp_string_36.length);
        this.write(out, request.getAttribute("oldName"));
        out.write(_jsp_string_38, 0, _jsp_string_38.length);
        this.write(out, request.getAttribute("hostName"));
        out.write(_jsp_string_40, 0, _jsp_string_40.length);
        this.write(out, (workspace.getName()));
        out.write(_jsp_string_42, 0, _jsp_string_42.length);
        out.write(_jsp_string_43, 0, _jsp_string_43.length);
        out.write(_jsp_string_44, 0, _jsp_string_44.length);
        this.write(out, (workspace.getDisplayName()));
        out.write(_jsp_string_46, 0, _jsp_string_46.length);
        out.write(_jsp_string_47, 0, _jsp_string_47.length);
        out.write(_jsp_string_48, 0, _jsp_string_48.length);
        out.write(_jsp_string_49, 0, _jsp_string_49.length);
        this.write(out, (workspace.getWork()));
        out.write(_jsp_string_51, 0, _jsp_string_51.length);
        out.write(_jsp_string_52, 0, _jsp_string_52.length);
        this.write(out, (workspace.getCharset()));
        out.write(_jsp_string_54, 0, _jsp_string_54.length);
        out.write(_jsp_string_55, 0, _jsp_string_55.length);
        out.write(_jsp_string_56, 0, _jsp_string_56.length);
        this.write(out, (workspace.getReadonly()));
        out.write(_jsp_string_58, 0, _jsp_string_58.length);
        out.write(_jsp_string_59, 0, _jsp_string_59.length);
        out.write(_jsp_string_60, 0, _jsp_string_60.length);
        out.write(_jsp_string_61, 0, _jsp_string_61.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_63, 0, _jsp_string_63.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_3 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_4 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_5 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Finder - Powered by Finder</title>\r\n");
    protected static final byte[] _jsp_string_6 = b("<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_7 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/admin/css/form.css\"/>\r\n");
    protected static final byte[] _jsp_string_8 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_9 = b("<script type=\"text/javascript\" src=\"?action=res&path=/admin/base.js\"></script>\r\n");
    protected static final byte[] _jsp_string_10 = b("<script type=\"text/javascript\">\r\n<!--\r\njQuery(function() {\r\n    jQuery(\"#submit\").click(function() {\r\n");
    protected static final byte[] _jsp_string_11 = b("        var oldName = jQuery.trim(jQuery(\"input[name=oldName]\").val());\r\n        var hostName = jQuery.trim(jQuery(\"input[name=hostName]\").val());\r\n");
    protected static final byte[] _jsp_string_12 = b("        var workspaceName = jQuery.trim(jQuery(\"input[name=workspaceName]\").val());\r\n");
    protected static final byte[] _jsp_string_13 = b("        var displayName = jQuery.trim(jQuery(\"input[name=displayName]\").val());\r\n");
    protected static final byte[] _jsp_string_14 = b("        var work = jQuery.trim(jQuery(\"input[name=work]\").val());\r\n        var charset = jQuery.trim(jQuery(\"input[name=charset]\").val());\r\n");
    protected static final byte[] _jsp_string_15 = b("        var readonly = jQuery(\"input[name=readonly]\").prop(\"checked\");\r\n\r\n        if(hostName.length < 1) {\r\n");
    protected static final byte[] _jsp_string_16 = b("            alert(\"主机名称不能为空！\");\r\n            return;\r\n        }\r\n\r\n        if(workspaceName.length < 1) {\r\n");
    protected static final byte[] _jsp_string_17 = b("            alert(\"工作空间名称不能为空！\");\r\n            return;\r\n        }\r\n\r\n        if(work.length < 1) {\r\n");
    protected static final byte[] _jsp_string_18 = b("            alert(\"工作目录不能为空！\");\r\n            return;\r\n        }\r\n\r\n        var params = [];\r\n");
    protected static final byte[] _jsp_string_19 = b("        var requestURI = window.location.pathname;\r\n        params[params.length] = \"oldName=\" + encodeURIComponent(oldName);\r\n");
    protected static final byte[] _jsp_string_20 = b("        params[params.length] = \"hostName=\" + encodeURIComponent(hostName);\r\n        params[params.length] = \"workspaceName=\" + encodeURIComponent(workspaceName);\r\n");
    protected static final byte[] _jsp_string_21 = b("        params[params.length] = \"displayName=\" + encodeURIComponent(displayName);\r\n");
    protected static final byte[] _jsp_string_22 = b("        params[params.length] = \"work=\" + encodeURIComponent(work);\r\n        params[params.length] = \"charset=\" + encodeURIComponent(charset);\r\n");
    protected static final byte[] _jsp_string_23 = b("        params[params.length] = \"readonly=\" + encodeURIComponent(readonly);\r\n\r\n        jQuery.ajax({\r\n");
    protected static final byte[] _jsp_string_24 = b("            type: \"post\",\r\n            url: requestURI + \"?action=admin.workspace.save\",\r\n");
    protected static final byte[] _jsp_string_25 = b("            dataType: \"json\",\r\n            data: params.join(\"&\"),\r\n            error: function(req, status, error) {\r\n");
    protected static final byte[] _jsp_string_26 = b("                alert(\"系统错误，请稍后再试！\");\r\n            },\r\n            success: function(result) {\r\n");
    protected static final byte[] _jsp_string_27 = b("                if(result.status != 200) {\r\n                    alert(result.message);\r\n");
    protected static final byte[] _jsp_string_28 = b("                    return;\r\n                }\r\n                alert(\"操作成功！\");\r\n");
    protected static final byte[] _jsp_string_29 = b("                window.location.href = \"?action=admin.workspace.list&hostName=\" + encodeURIComponent(hostName);\r\n");
    protected static final byte[] _jsp_string_30 = b("            }\r\n        });\r\n    });\r\n});\r\n//-->\r\n</script>\r\n</head>\r\n<body>\r\n<div class=\"menu-bar\">\r\n");
    protected static final byte[] _jsp_string_31 = b("    <a class=\"button\" href=\"javascript:void(0)\" onclick=\"window.history.back();\"><span class=\"back\"></span>返回</a>\r\n");
    protected static final byte[] _jsp_string_32 = b("    <a class=\"button\" href=\"javascript:void(0)\" onclick=\"window.location.reload();\"><span class=\"refresh\"></span>刷新</a>\r\n");
    protected static final byte[] _jsp_string_33 = b("    <span class=\"seperator\"></span>\r\n</div>\r\n<div class=\"form\">\r\n    <div class=\"title\"><h4>工作空间编辑(");
    protected static final byte[] _jsp_string_35 = b(")</h4></div>\r\n    <div class=\"form-row\">\r\n        <div class=\"form-label\">Workspace Name：</div>\r\n");
    protected static final byte[] _jsp_string_36 = b("        <div class=\"form-c300\">\r\n            <div class=\"form-field\">\r\n                <input name=\"oldName\" type=\"hidden\" value=\"");
    protected static final byte[] _jsp_string_38 = b("\"/>\r\n                <input name=\"hostName\" type=\"hidden\" value=\"");
    protected static final byte[] _jsp_string_40 = b("\"/>\r\n                <input name=\"workspaceName\" type=\"text\" class=\"text w200\" placeholder=\"Workspace Name\" value=\"");
    protected static final byte[] _jsp_string_42 = b("\"/>\r\n            </div>\r\n        </div>\r\n        <div class=\"form-m300\">\r\n            <div class=\"form-comment\">工作空间名。字母和数字开头，允许包含的字符: [a-z], [A-Z], [0-9], [-_.:@].</div>\r\n");
    protected static final byte[] _jsp_string_43 = b("        </div>\r\n    </div>\r\n    <div class=\"form-row\">\r\n        <div class=\"form-label\">Display Name：</div>\r\n");
    protected static final byte[] _jsp_string_44 = b("        <div class=\"form-c300\">\r\n            <div class=\"form-field\">\r\n                <input name=\"displayName\" type=\"text\" class=\"text w200\" placeholder=\"Display Name\" value=\"");
    protected static final byte[] _jsp_string_46 = b("\"/>\r\n            </div>\r\n        </div>\r\n        <div class=\"form-m300\">\r\n            <div class=\"form-comment\">显示名。</div>\r\n");
    protected static final byte[] _jsp_string_47 = b("        </div>\r\n    </div>\r\n    <div class=\"form-row\">\r\n        <div class=\"form-label\">Work:</div>\r\n");
    protected static final byte[] _jsp_string_48 = b("        <div class=\"form-comment\">当前主机的本地磁盘目录。contextPath:前缀表示finder自己的应用目录，无前缀表示磁盘的绝对地址。</div>\r\n");
    protected static final byte[] _jsp_string_49 = b("        <div class=\"form-field\">\r\n            <input name=\"work\" type=\"text\" class=\"text w400\" placeholder=\"Work Directory\" value=\"");
    protected static final byte[] _jsp_string_51 = b("\"/>\r\n        </div>\r\n    </div>\r\n    <div class=\"form-row\">\r\n        <div class=\"form-label\">Charset：</div>\r\n");
    protected static final byte[] _jsp_string_52 = b("        <div class=\"form-c300\">\r\n            <div class=\"form-field\">\r\n                <input name=\"charset\" type=\"text\" class=\"text w200\" placeholder=\"Charset\" value=\"");
    protected static final byte[] _jsp_string_54 = b("\"/>\r\n            </div>\r\n        </div>\r\n        <div class=\"form-m300\">\r\n            <div class=\"form-comment\">工作空间文本文件的字符集。</div>\r\n");
    protected static final byte[] _jsp_string_55 = b("        </div>\r\n    </div>\r\n    <div class=\"form-row\">\r\n        <div class=\"form-label\">Readonly：</div>\r\n");
    protected static final byte[] _jsp_string_56 = b("        <div class=\"form-c300\">\r\n            <div class=\"form-field\">\r\n                <input name=\"readonly\" type=\"checkbox\" checked-value=\"");
    protected static final byte[] _jsp_string_58 = b("\" value=\"true\"/>\r\n            </div>\r\n        </div>\r\n        <div class=\"form-m300\">\r\n");
    protected static final byte[] _jsp_string_59 = b("            <div class=\"form-comment\">是否只读。只读模式：包括管理员在内的所有用户都无写权限。</div>\r\n        </div>\r\n");
    protected static final byte[] _jsp_string_60 = b("    </div>\r\n\r\n    <div class=\"button\">\r\n        <button id=\"submit\" class=\"button ensure\">保 存</button>\r\n");
    protected static final byte[] _jsp_string_61 = b("    </div>\r\n</div>\r\n<div id=\"pageContext\" style=\"display: none;\" contextPath=\"");
    protected static final byte[] _jsp_string_63 = b("\"></div>\r\n</body>\r\n</html>");

}
