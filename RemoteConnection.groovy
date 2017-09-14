/**
 * @author aakash on 14/9/17.
 */
@Grab('com.aestasit.infrastructure.sshoogr:sshoogr:0.9.26')
import static com.aestasit.infrastructure.ssh.DefaultSsh.*

trustUnknownHosts = true
remoteSession {
    host = '192.168.13.11'
    username = 'demouser'
    password = 'demo@123'
    port = 22
    connect()
    exec 'ls -lha'
    disconnect()
}