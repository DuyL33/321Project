Author:
Louis Specter
Duy Le


Product goal: Enable Department of Homeland Security (DHS) personnel to make queries
against a database of immigrants. DHS personnel should then be able to confirm if an
immigrant's status permits modification, and if so be able to make those modifications. The
application shall also abide by all DHS formatting guidelines.



Changes 10-31-23
Added DEScreen and Driver
Changed Database.getImmigrant() argument order, now is id, first name, last name
Suggested: Change Immigrant.createImmigrant() to a static method, makes it easier to call from other methods and it doesnt need to be tied to an instance anyways


Changes 11-2-23
Added Review
Changed Immigrant. status initialized to ""


Nov 27 fork
