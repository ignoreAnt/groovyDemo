import groovy.xml.MarkupBuilder

/**
 * @author aakash on 13/9/17.
 */

def stringWriter = new StringWriter()
def xml = new MarkupBuilder(stringWriter)
xml.languages(type: "current", count: 3, mainstream: true){
    language(flavour: "static", currentversion: "1.8","Java")
    language(flavour: "dynamic", currentversion: "2.4.12","Groovy")
    language(flavour: "dynamic", currentversion: "ES6","JavaScript")
}

println stringWriter
def filePath = '../resources/languages.xml'
new File(filePath).write(stringWriter.toString())