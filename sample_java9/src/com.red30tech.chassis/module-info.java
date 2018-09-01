module com.red30tech.chassis {
	//Modules Required by this Module 
	requires	com.red30tech.axle;
	
	//Packages Exported by this Module
	exports		com.red30tech.chassis.api;
	
	//Classes Exposed by this Module
	provides	com.red30tech.chassis.api.Chassis with 
				com.red30tech.chassis.type.SuvChassis;
}
