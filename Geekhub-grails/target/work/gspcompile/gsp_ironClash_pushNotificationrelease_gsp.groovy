import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ironClash_pushNotificationrelease_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pushNotification/release.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',4,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("notification")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(version)
printHtmlPart(5)
if(true && (date)) {
printHtmlPart(6)
expressionOut.print(date.format('yyyy-MM-dd HH:mm:ss'))
}
printHtmlPart(7)
if(true && (!date)) {
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('datePicker','g',16,['name':("date"),'default':(date)],-1)
printHtmlPart(10)
expressionOut.print(version)
printHtmlPart(11)
})
invokeTag('form','g',20,['action':("release"),'method':("post")],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',22,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389000041000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
