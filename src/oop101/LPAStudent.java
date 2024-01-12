package oop101;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}
/*
* Paramaters declared as field, private and final
* java generates a to string method that prints out each attribute in a string
* in addition to private final field for each component, java generates public accessor for each component
* this method has the same name and type of the component, but it does not have any kind of special
* prefix, not get, or is for example
* id()
* name()
*
* */