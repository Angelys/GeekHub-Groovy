import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ironClash__menu_navbar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_navbar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
expressionOut.print(resource(plugin: 'kickstart-with-bootstrap', dir:'kickstart/img', file:'grails.png'))
printHtmlPart(2)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(3)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(4)
expressionOut.print(meta(name:'app.version'))
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',23,['template':("/_menu/admin")],-1)
printHtmlPart(7)
})
invokeTag('ifAnyGranted','sec',24,['roles':("ROLE_ADMIN")],1)
printHtmlPart(7)
invokeTag('render','g',25,['template':("/_menu/user")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388661368000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
