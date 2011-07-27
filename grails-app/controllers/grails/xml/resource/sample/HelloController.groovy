package grails.xml.resource.sample

class HelloController {
	def myBean
	
    def index = { render myBean }
}
