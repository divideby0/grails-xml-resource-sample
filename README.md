# Problem #

This project is meant to demonstrate what happens when we have a broken
bean configuration which is being imported from resources.xml.  Our springapp-hello.xml is malformed, however, Grails does not complain about the error on application startup, failing only in the runtime when we attempt to access myBean from the HelloController.