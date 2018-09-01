Terms
=====
	Classes		=> .
	Package		=> Container of Classes
	Modules		=> Container of Packages

Keywords
========
	export		=> Used inside module-info.java to export packages inside modules
	require		=> Used inside module-info.java to use packages of other modules


Golden Rule >>>>> "Export a Package but Require a Module"



Transitive Dependencies
=======================
* If A requires B
	 C requires B
	 C get A
	   
A Transfer of dependencies to dependent modules


Qualified Exports
=================
* Qualified exports reverse the dependency flaw.
* Exporting module should not know which modules are depending upon them, A Qualified export breaks this Rule.


Service Dependencies
====================
* Service loader does not replace dependency injection framework.
* Ideal for standalone java SE applications

Optional Dependencies
=====================





#####################
##Project Structure##
#####################
sample_java9$ find src

src
src/com.red30tech.driver
src/com.red30tech.driver/module-info.java
src/com.red30tech.driver/com
src/com.red30tech.driver/com/red30tech
src/com.red30tech.driver/com/red30tech/TestDriver.java

src/com.red30tech.chassis
src/com.red30tech.chassis/module-info.java
src/com.red30tech.chassis/com
src/com.red30tech.chassis/com/red30tech
src/com.red30tech.chassis/com/red30tech/chassis
src/com.red30tech.chassis/com/red30tech/chassis/type
src/com.red30tech.chassis/com/red30tech/chassis/type/SedanChassis.java
src/com.red30tech.chassis/com/red30tech/chassis/type/SuvChassis.java
src/com.red30tech.chassis/com/red30tech/chassis/api
src/com.red30tech.chassis/com/red30tech/chassis/api/Chassis.java

src/com.red30tech.movement
src/com.red30tech.movement/module-info.java
src/com.red30tech.movement/com
src/com.red30tech.movement/com/red30tech
src/com.red30tech.movement/com/red30tech/movement
src/com.red30tech.movement/com/red30tech/movement/rubberpart
src/com.red30tech.movement/com/red30tech/movement/rubberpart/RubberTire.java
src/com.red30tech.movement/com/red30tech/movement/rubberpart/Valve.java
src/com.red30tech.movement/com/red30tech/movement/metalpart
src/com.red30tech.movement/com/red30tech/movement/metalpart/Rim.java
src/com.red30tech.movement/com/red30tech/movement/api
src/com.red30tech.movement/com/red30tech/movement/api/Wheel.java
src/com.red30tech.movement/com/red30tech/movement/api/TestWheel.java

src/com.red30tech.axle
src/com.red30tech.axle/module-info.java
src/com.red30tech.axle/com
src/com.red30tech.axle/com/red30tech
src/com.red30tech.axle/com/red30tech/axle
src/com.red30tech.axle/com/red30tech/axle/api
src/com.red30tech.axle/com/red30tech/axle/api/TestAxle.java
src/com.red30tech.axle/com/red30tech/axle/api/Axle.java

