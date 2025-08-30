﻿ - Department --> Faculty
	- Relationship type: Aggregation
	- The hollow diamond on Department means that a department aggregates Faculty.
	- Multiplicity on the Faculty side means a Department can have zero or many Faculty members.
	- Navigability indicates that the Department knows its Faculty, but not necessarily the other way around.
	- Faculty can exist independently of a Department
- AlarmController -- Sensor
	- Relationship Type: Association
	-  Multiplicity (1) on the AlarmController side and (1..*) on the Sensor side means each AlarmController is connected to one or more Sensors and each Sensor is connected to exactly one AlarmController.
	- No arrows are shown, so both classes are aware of each other.

