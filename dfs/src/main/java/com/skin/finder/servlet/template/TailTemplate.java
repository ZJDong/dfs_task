/*
 * $RCSfile: TailTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * <p>Title: TailTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class TailTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final TailTemplate instance = new TailTemplate();


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

        out.write(_jsp_string_0, 0, _jsp_string_0.length);
        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        out.write(_jsp_string_2, 0, _jsp_string_2.length);
        this.write(out, request.getAttribute("fileName"));
        out.write(_jsp_string_4, 0, _jsp_string_4.length);
        out.write(_jsp_string_5, 0, _jsp_string_5.length);
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        this.write(out, request.getAttribute("host"));
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        this.write(out, request.getAttribute("workspace"));
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        this.write(out, request.getAttribute("parent"));
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        this.write(out, request.getAttribute("path"));
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        this.write(out, request.getAttribute("charset"));
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        out.write(_jsp_string_23, 0, _jsp_string_23.length);
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        this.write(out, request.getAttribute("host"));
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        this.write(out, request.getAttribute("workspace"));
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        this.write(out, request.getAttribute("path"));
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        this.write(out, request.getAttribute("fileName"));
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        this.write(out, request.getAttribute("charset"));
        out.write(_jsp_string_34, 0, _jsp_string_34.length);
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        out.write(_jsp_string_36, 0, _jsp_string_36.length);
        out.write(_jsp_string_37, 0, _jsp_string_37.length);
        out.write(_jsp_string_38, 0, _jsp_string_38.length);
        out.write(_jsp_string_39, 0, _jsp_string_39.length);
        out.write(_jsp_string_40, 0, _jsp_string_40.length);
        out.write(_jsp_string_41, 0, _jsp_string_41.length);
        out.write(_jsp_string_42, 0, _jsp_string_42.length);
        out.write(_jsp_string_43, 0, _jsp_string_43.length);
        out.write(_jsp_string_44, 0, _jsp_string_44.length);
        out.write(_jsp_string_45, 0, _jsp_string_45.length);
        out.write(_jsp_string_46, 0, _jsp_string_46.length);
        out.write(_jsp_string_47, 0, _jsp_string_47.length);
        out.write(_jsp_string_48, 0, _jsp_string_48.length);
        out.write(_jsp_string_49, 0, _jsp_string_49.length);
        out.write(_jsp_string_50, 0, _jsp_string_50.length);
        out.write(_jsp_string_51, 0, _jsp_string_51.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_0 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_1 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_2 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>tail - ");
    protected static final byte[] _jsp_string_4 = b(" - Powered by Finder</title>\r\n<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_5 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/finder/css/less.css\"/>\r\n");
    protected static final byte[] _jsp_string_6 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_7 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/config.js\"></script>\r\n");
    protected static final byte[] _jsp_string_8 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/charset.js\"></script>\r\n");
    protected static final byte[] _jsp_string_9 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/tail.js\"></script>\r\n");
    protected static final byte[] _jsp_string_10 = b("</head>\r\n<body contextPath=\"");
    protected static final byte[] _jsp_string_12 = b("\" host=\"");
    protected static final byte[] _jsp_string_14 = b("\" workspace=\"");
    protected static final byte[] _jsp_string_16 = b("\" parent=\"");
    protected static final byte[] _jsp_string_18 = b("\" path=\"");
    protected static final byte[] _jsp_string_20 = b("\" charset=\"");
    protected static final byte[] _jsp_string_22 = b("\">\r\n<div id=\"tail-container\" class=\"less-container\" contenteditable=\"true\" spellcheck=\"false\"></div>\r\n");
    protected static final byte[] _jsp_string_23 = b("<div class=\"less-status-bar\">\r\n    <div style=\"height: 18px; background-color: #333333;\">\r\n");
    protected static final byte[] _jsp_string_24 = b("        <span class=\"file\"><input id=\"less-file\" type=\"text\" class=\"text w240\" readonly=\"true\" title=\"");
    protected static final byte[] _jsp_string_26 = b("@");
    protected static final byte[] _jsp_string_28 = b("/");
    protected static final byte[] _jsp_string_30 = b("\" value=\"");
    protected static final byte[] _jsp_string_32 = b("\"/></span>\r\n        <span class=\"charset\"><select name=\"charset\" selected-value=\"");
    protected static final byte[] _jsp_string_34 = b("\"></select></span>\r\n        <span class=\"ctrl\">\r\n            <input id=\"tail-reload-btn\" type=\"button\" class=\"button\" value=\"刷 新\"/>\r\n");
    protected static final byte[] _jsp_string_35 = b("            <input id=\"tail-clear-btn\" type=\"button\" class=\"button\" value=\"清 空\"/>\r\n");
    protected static final byte[] _jsp_string_36 = b("            <input id=\"tail-stop-btn\" type=\"button\" class=\"button\" value=\"停 止\"/>\r\n");
    protected static final byte[] _jsp_string_37 = b("            <input id=\"tail-select-btn\" type=\"button\" class=\"button\" value=\"全 选\"/>\r\n");
    protected static final byte[] _jsp_string_38 = b("            <input id=\"tail-find-btn\" type=\"button\" class=\"button\" value=\"过 滤\"/>\r\n");
    protected static final byte[] _jsp_string_39 = b("        </span>\r\n        <span class=\"pad4\"><input id=\"tail-reload-interval\" type=\"hidden\" class=\"text w30\" value=\"1\"/></span>\r\n");
    protected static final byte[] _jsp_string_40 = b("        <span class=\"pad4\"><input id=\"tail-auto-scroll\" type=\"checkbox\" class=\"checkbox\" checked=\"true\"/>自动滚动</span>\r\n");
    protected static final byte[] _jsp_string_41 = b("    </div>\r\n</div>\r\n<div id=\"find-panel\" class=\" dialog\" style=\"top: 100px; display: none;\">\r\n");
    protected static final byte[] _jsp_string_42 = b("    <div class=\"find-panel\">\r\n        <div>\r\n            查找内容: <input id=\"grep-keyword\" type=\"text\" class=\"grep-keyword\" value=\"\" placeholder=\"正则示例: /finder/.*\\.html\"/>\r\n");
    protected static final byte[] _jsp_string_43 = b("            <input id=\"grep-ensure\" type=\"button\" class=\"grep-search\" value=\"确定\"/>\r\n");
    protected static final byte[] _jsp_string_44 = b("        </div>\r\n        <div style=\"clear: both; padding-top: 12px; height: 20px;\">\r\n");
    protected static final byte[] _jsp_string_45 = b("            <span style=\"float: left; width: 10px; display: inline-block;\"><input id=\"grep-regexp\" type=\"checkbox\" title=\"正则表达式\"/></span>\r\n");
    protected static final byte[] _jsp_string_46 = b("            <span style=\"float: left; margin-left: 6px; margin-top: -1px; width: 100px; display: inline-block;\">正则表达式</span>\r\n");
    protected static final byte[] _jsp_string_47 = b("        </div>\r\n        <div style=\"clear: both; margin-top: 10px;\">\r\n            <p><span style=\"color: #ff0000;\">提示：</span>快捷键(Ctrl + B)，再次按下可关闭。</p>\r\n");
    protected static final byte[] _jsp_string_48 = b("            <p><span style=\"color: #ff0000;\">说明：</span>正则相关文档请参考JavaScript正则表达式 。</p>\r\n");
    protected static final byte[] _jsp_string_49 = b("        </div>\r\n        <div style=\"margin-top: 20px; text-align: center;\">\r\n            <input id=\"grep-close\" type=\"button\" class=\"grep-button\" value=\"取消\"/>\r\n");
    protected static final byte[] _jsp_string_50 = b("        </div>\r\n    </div>\r\n</div>\r\n<!-- http://www.finderweb.net -->\r\n</body>\r\n");
    protected static final byte[] _jsp_string_51 = b("</html>\r\n");

}
