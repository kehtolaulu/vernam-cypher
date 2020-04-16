# vernam-cypher
Decode/Encode messages with Vernam's cypher

## Usage:

1. run `source .aliases`
2. run `build`
3. to encode run `encode $KEY < message.txt` (append ` > encoded.txt` if you want to write to file)
4. to decode run `decode $KEY < encoded.txt` (append ` > decoded.txt` if you want to write to file)
5. to compare original message and decoded one run `diff message.txt decoded.txt` (if no output it's ok)

## Dependencies:

- Bash
- Java
- Kotlin
