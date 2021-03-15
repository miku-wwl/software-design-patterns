# 软件设计模式

软件设计模式

https://www.runoob.com/design-pattern/design-pattern-tutorial.html

# -------------------------

# 1.工厂模式

创建型模式

![工厂模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/AB6B814A-0B09-4863-93D6-1E22D6B07FF8.jpg)

~~~
意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

主要解决：主要解决接口选择的问题。
~~~

# 2.抽象工厂模式

创建型模式

![抽象工厂模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/3E13CDD1-2CD2-4C66-BD33-DECBF172AE03.jpg)

~~~
意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

主要解决：主要解决接口选择的问题
~~~

# 3.单例模式

创建型模式

![单例模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/62576915-36E0-4B67-B078-704699CA980A.jpg)

~~~
意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

主要解决：一个全局使用的类频繁地创建与销毁。
~~~

# 4.建造者模式

创建型模式

![建造者模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20210306-builder-pattern.svg)

~~~
意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。

主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
~~~

# 5.原型模式

创建型模式

![原型模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201202-prototype-pattern.png)

~~~
意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

主要解决：在运行期建立和删除原型。
~~~

# -------------------------

# 6.适配器模式

结构型模式

![适配器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20210223-adapter.png)

~~~
意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
~~~

# 7.桥接模式

结构型模式

![桥接模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-bridge.svg)

~~~
意图：将抽象部分与实现部分分离，使它们都可以独立的变化。

主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
~~~

# 8.过滤器模式

结构型模式

![过滤器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-filter-md-20201230.svg)

~~~
过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
~~~

# 9.组合模式

结构型模式

![组合模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-composite.svg)

~~~
意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
~~~

# 10.装饰器模式

结构型模式

![装饰器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20210204-decorator-1-decorator.svg)

~~~
意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。

主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
~~~

# 11.外观模式

结构型模式

![外观模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-facade.svg)

~~~
意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
~~~

# 12.享元模式

结构型模式

![享元模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-fiyweight.svg)

~~~
意图：运用共享技术有效地支持大量细粒度的对象。

主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建
~~~

# 13.代理模式

结构型模式

![代理模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-proxy.svg)

~~~
意图：为其他对象提供一种代理以控制对这个对象的访问。

主要解决：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
~~~

# -------------------------

# 14.责任链模式

行为型模式

![责任链模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/2021-chain-of-responsibility.svg)

~~~
意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。

主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
~~~

# 15.命令模式

行为型模式

![img](https://www.runoob.com/wp-content/uploads/2014/08/20201015-command-1.svg)

~~~
意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。

主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
~~~

# 16.解释器模式

行为型模式

![解释器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/interpreter_pattern_uml_diagram.jpg)

~~~
意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。

主要解决：对于一些固定文法构建一个解释句子的解释器。
~~~

# 17.迭代器模式

行为型模式

![迭代器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/iterator_pattern_uml_diagram.jpg)

~~~
意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。

主要解决：不同的方式来遍历整个整合对象。
~~~

中介者模式

![中介者模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/mediator_pattern_uml_diagram.jpg)

~~~
意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
~~~

# 18.备忘录模式

行为型模式

![备忘录模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/memento_pattern_uml_diagram.jpg)

~~~
意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。

主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
~~~

# 19.观察者模式

行为型模式

![观察者模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/observer_pattern_uml_diagram.jpg)

~~~
意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。

主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
~~~

# 20.状态模式

![状态模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/state_pattern_uml_diagram.png)

~~~
意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。

主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
~~~



# 22.策略模式

行为型模式

![策略模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/strategy_pattern_uml_diagram.jpg)

~~~
意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。

主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
~~~

# 23.模板模式

行为型模式

![模板模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/template_pattern_uml_diagram.jpg)

~~~
意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
~~~

# 24.访问者模式

行为型模式

![访问者模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/visitor_pattern_uml_diagram.jpg)

~~~
意图：主要将数据结构与数据操作分离。

主要解决：稳定的数据结构和易变的操作耦合问题。
~~~



# -------------------------

# 21#.空对象模式

![空对象模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/null_pattern_uml_diagram.jpg)

# 25#.MVC 模式

![MVC 模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/mvc-2.svg)

~~~
MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。

Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
View（视图） - 视图代表模型包含的数据的可视化。
Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
~~~

![img](https://www.runoob.com/wp-content/uploads/2014/08/1200px-ModelViewControllerDiagram2.svg_.png)

# 26#.业务代表模式

![业务代表模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/business.svg)

~~~
业务代表模式（Business Delegate Pattern）用于对表示层和业务层解耦。它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。在业务层中我们有以下实体。

客户端（Client） - 表示层代码可以是 JSP、servlet 或 UI java 代码。
业务代表（Business Delegate） - 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问。
查询服务（LookUp Service） - 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。
业务服务（Business Service） - 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑。
~~~

# 27#.组合实体模式

![组合实体模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/compositeentity_pattern_uml_diagram.jpg)

~~~
组合实体模式（Composite Entity Pattern）用在 EJB 持久化机制中。一个组合实体是一个 EJB 实体 bean，代表了对象的图解。当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的。以下是组合实体 bean 的参与者。

组合实体（Composite Entity） - 它是主要的实体 bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
粗粒度对象（Coarse-Grained Object） - 该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
依赖对象（Dependent Object） - 依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
策略（Strategies） - 策略表示如何实现组合实体。
~~~

# 28#.数据访问对象模式

![数据访问对象模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/dao_pattern_uml_diagram.jpg)

~~~
数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来。以下是数据访问对象模式的参与者。

数据访问对象接口（Data Access Object Interface） - 该接口定义了在一个模型对象上要执行的标准操作。
数据访问对象实体类（Data Access Object concrete class） - 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。
模型对象/数值对象（Model Object/Value Object） - 该对象是简单的 POJO，包含了 get/set 方法来存储通过使用 DAO 类检索到的数据。
~~~

# 29#.前端控制器模式

![前端控制器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/frontcontroller_pattern_uml_diagram.jpg)

~~~
前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。

前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
视图（View） - 视图是为请求而创建的对象。
~~~

# 30#.拦截过滤器模式

![拦截过滤器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-intercepting.svg)

~~~
拦截过滤器模式（Intercepting Filter Pattern）用于对应用程序的请求或响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。

过滤器（Filter） - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
过滤器链（Filter Chain） - 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
Target - Target 对象是请求处理程序。
过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链。
客户端（Client） - Client 是向 Target 对象发送请求的对象。
~~~

# 31#.服务定位器模式

![服务定位器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-service-locator.svg)

~~~
服务定位器模式（Service Locator Pattern）用在我们想使用 JNDI 查询定位各种服务的时候。考虑到为某个服务查找 JNDI 的代价很高，服务定位器模式充分利用了缓存技术。在首次请求某个服务时，服务定位器在 JNDI 中查找服务，并缓存该服务对象。当再次请求相同的服务时，服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能。以下是这种设计模式的实体。

服务（Service） - 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到。
Context / 初始的 Context - JNDI Context 带有对要查找的服务的引用。
服务定位器（Service Locator） - 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触。
缓存（Cache） - 缓存存储服务的引用，以便复用它们。
客户端（Client） - Client 是通过 ServiceLocator 调用服务的对象。
~~~

# 32#.传输对象模式

![传输对象模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20201015-transfer.svg)

~~~
传输对象模式（Transfer Object Pattern）用于从客户端向服务器一次性传递带有多个属性的数据。传输对象也被称为数值对象。传输对象是一个具有 getter/setter 方法的简单的 POJO 类，它是可序列化的，所以它可以通过网络传输。它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充 POJO，并把它发送到客户端或按值传递它。对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值。以下是这种设计模式的实体。

业务对象（Business Object） - 为传输对象填充数据的业务服务。
传输对象（Transfer Object） - 简单的 POJO，只有设置/获取属性的方法。
客户端（Client） - 客户端可以发送请求或者发送传输对象到业务对象。
~~~

