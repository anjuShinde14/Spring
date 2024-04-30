 	Farmwork –
-	Farmwork is a set of API (it’s predefined class & interface) which works predefined algorithms & targeted to specific domain.
-	To develop the Application in the systematic format with heap of farmwork.
-	E.g. in photo studio shop.

 	Spring –
-	Open-source java farmwork.
-	we can developed standalone & Enterprise applications using spring.
-	It realized in 2003 (Apache 1.0).
-	Its production realized in 2004 (Apache 1.0).
-	String developed by ‘rod  john son’.
-	Spring is a framework-
i.e- combination of framework
means it work on all functionality of core java standalone standalone Applica                                                                                    tion, web application , data structure, as well as collection framework.
-	It has a fixed flow it already predefined.
e.g. bus route is fixed from katraj to swarget  & swarget to katraj.
-	Spring is a Light wight comprehensive framework to simplify the java (standalone + J2EE) development.
Light weight- framework size is small + minimum number of jars + minimal overheads.
Comprehensive-provides lot of functionality in minimal code.
-	Simplify java development-developer focused on business logic, spring manage testing, integration of other library..
-	Dependency Injection-

 	Feathers of Spring-
1] Modular-  different jar for different functionality.
2]flexible-     most of framework follows All or nothing.
3]policy -       Spring is Exception.
4] test Driven Development- Unit testing is well integrated in Spring +    support for other testing.
5]Maintainable & Extendable-start with interface and can change with time.
6] Exception-  Spring convert / wrap all checked exception into unchecks one. 

 	IOC Container-
-	Stands for inversion of control.
-	It is used to create a object of class,
Maintain the lifecycle of object,
Manage it state by spring.
-	So it is called loosely coupling, for this spring is more popular in market.
-	Mainly it is based on two concept-
[i]DI (dependency Injection)-
    - the object initialization done by spring, adding a dependency injection into the object.
    -Dependency injection is a way to achieve IOC.
    -ex.- to implement IOC we required a dependency injection.
    - runtime object creation is not allowed.
    - It create object before runtime & it inject whenever we want it gives object.

-	It is the process of injecting a dependent class object into target class object.
-	EX-controller class method wants to call service class method then service class method inject to the controller class.
-	We can perform a dependency injection by three way-
1-	Setter injection
2-	Constructor injection
3-	Fild injection
-	By default, spring call seter level injection.
-	In spring farmwork IOC container will take care of this dependency injection.
-	To perform a dependency injection we need to use a auto wired annotation
[ii]IOC(Inversion of control)-

    -It is a Architecheral pattern describe that programmer do not need to create a object, Instead of that just describe how it should be created.
    - no need to directly connect your component & service together in a program.
      instead of that just described which service needed by which  component  in configuration file / XML file
      For that spring IOC container is responsible.
    -IOC create a singleton object that mins that object only created only once & we can use that object  thought the application whenever we need.
                    * IOC container has a two type-
                     1] Bean Factory-
                           - It is an Interface.
                           - We can use some implemented class using this interface.
                           - now it is outdated.
                       2] Application Context-
                             - It is an interface.
                             - we can use some implemented methods using this interface.
                - Application context nothing but spring container in never                                                                      	       version of spring Application Context to developed a enterprise                  Application.
                 - class is used ClasspathApplicationContext.
         * Thear are two types of ApplicationContext-
           I] classpathxmlBased
           ii]AnnotationbasedApplicationContext(MyConfiguration.Class)
                            
