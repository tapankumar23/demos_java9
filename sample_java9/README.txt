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
