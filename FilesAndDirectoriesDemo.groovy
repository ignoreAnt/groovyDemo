import groovy.io.FileType

/**
 * @author aakash on 14/9/17.
 */

(1..3).each {
    new File("dir$it").mkdir()
}

(1..3).each {
    def file = new File("File$it")
    file << "Sample content for ${file.absolutePath}"
}

def currentDir = new File('.')
currentDir.eachFile(FileType.DIRECTORIES) {
    println it.name
}

currentDir.eachFile(FileType.FILES) {
    println it.name
}
