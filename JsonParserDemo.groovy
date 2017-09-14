import groovy.json.JsonSlurper

/**
 * @author aakash on 13/9/17.
 */

def filePath = '../resources/people.json'
def inputJson = new JsonSlurper().parseText(new File(filePath).text)

assert inputJson instanceof Map
println inputJson
println inputJson.people.person.conferences