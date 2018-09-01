module com.red30tech.chassis {
	exports		com.red30tech.chassis.api;
	
	requires	com.red30tech.axle;
	provides	com.red30tech.chassis.api.Chassis with 
				com.red30tech.chassis.type.SuvChassis;
}
