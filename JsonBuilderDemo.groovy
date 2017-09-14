import groovy.json.JsonBuilder

/**
 * @author aakash on 13/9/17.
 */

def builder = new JsonBuilder()
def root = builder.people {
    person {
        firstName 'Aakash'
        lastName 'Bamne'

        // Named arguments are valid values for objects too
        address(
                city: 'Paris',
                country: 'France',
                zip: 12345
        )

        married 'true'

        // A list of values
        conferences 'JavaOne', 'GroovyConf'
    }
}

println builder.toPrettyString()
def filePath = '../resources/people.json'
new File(filePath).write(builder.toPrettyString())