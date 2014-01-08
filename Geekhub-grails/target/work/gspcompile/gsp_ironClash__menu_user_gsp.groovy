import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ironClash__menu_user_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_user.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('message','g',8,['code':("security.signin.label")],-1)
printHtmlPart(2)
expressionOut.print(request.contextPath)
printHtmlPart(3)
})
invokeTag('ifNotLoggedIn','sec',20,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(sec.loggedInUserInfo(field: 'username'))
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('message','g',35,['code':("security.signoff.label")],-1)
printHtmlPart(8)
})
invokeTag('link','g',37,['controller':("logout")],2)
printHtmlPart(9)
})
invokeTag('ifLoggedIn','sec',37,[:],1)
printHtmlPart(10)
createTagBody(1, {->
invokeTag('message','g',44,['code':("default.user.unknown.label")],-1)
})
invokeTag('link','g',44,['controller':("user"),'action':("show")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388667485000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
