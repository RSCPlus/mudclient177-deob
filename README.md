# mudclient177-deob
A minimally edited deob of mudclient177.

## Usage:
`java -jar ./mudclient177-deob.jar [members] [ip address] [port] [RSA Exponent] [RSA Modulus] [disable opcode obfuscation]`

* `[members]`
  * pass any value other than "members" to load a free to play configuration
* `[ip address]`
  * an IPv4 address where the RSC177 compatible server is hosted
* `[port]`
  * network port number (e.g. 43594)
* `[RSA Exponent]`
* `[RSA Modulus]`
  * These two are used together to encrypt password, unique to each server
* `[disable opcode obfuscation]`
  * Pass the value "true" to disable opcode obfuscation

## Changes from vanilla:
1. Many fields are named
2. Three new command line arguments to help facilitate changing the client's endpoint
