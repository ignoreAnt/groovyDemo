/**
 * @author aakash on 14/9/17.
 */

def connection = new URL( "https://query.yahooapis.com/v1/public/yql?q=" +
        URLEncoder.encode(
                "select temper from weather.forecast where woeid in " + "(select woeid from geo.places(1) where " +
                        "text='bangalore,India')",
                'UTF-8' ) )
        .openConnection() as HttpURLConnection

// set some headers
connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
connection.setRequestProperty( 'Accept', 'application/json' )

// get the response code - automatically sends the request
println connection.responseCode + ": " + connection.inputStream.text
