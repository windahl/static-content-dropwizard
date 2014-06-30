#Static content from the root path with Dropwizard 0.7.0
This is a minimalistic application that demonstrates how to serve static content from the root path with Dropwizard 0.7.0.

A static html page will be located at http://localhost:8080/
And the simple REST API will be found under http://localhost:8080/service

In Dropwizard 0.6.2 you could set the rootPath through your config file, that isn't possible anymore.
Now you have to do it programmatically instead: `environment.jersey().setUrlPattern("/service/*");`
