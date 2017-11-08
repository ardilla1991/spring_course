package com.htp.lab.spring.course.impls.conveyor;

import com.htp.lab.spring.course.interfaces.Robot;
import com.htp.lab.spring.course.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor{

	@Override
	public abstract Robot createRobot();
}
