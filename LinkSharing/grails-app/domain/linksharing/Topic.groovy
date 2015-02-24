package linksharing

import java.util.Date;

class Topic {
	User createdBy
	String name;
	static belongsTo = [createdBy:User]
	Date dateCreated,lastUpdated;
	
    static constraints = {
    }
}
