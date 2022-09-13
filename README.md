# api-digitraffic
Java code used to fetch traffic data from Digitraffic API. <br />
The data is stored in JSON and the API response is GZIP compressed. <br />
The Gson library is used to convert the JSON response to an equivalent Java object.<br />
The methods for data fetching can be found in the file ServerRequest.java.<br />
The methods for URL generation can be found in the file DigiURL.java<br />
Code testing is done in the file Main.java and the rest of the classes are merely representations
of the data being fetched.<br /><br />
More info on the API:<br />
https://www.digitraffic.fi/
<br /><br />
More info on Gson:<br />
https://sites.google.com/site/gson/
