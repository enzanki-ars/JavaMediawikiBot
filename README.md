To create a Mediawiki bot, create a class that extends src/WikiBot/code/BotPanel.java. One example is created called InterwikiBot.java.

Useful bot methods and bot settings may be found in src/WikiBot/core/GenericBot.java.

Suggestions:
* To propose an edit, use ProposeEdit(APIcommand command, String editSummary).
* To automatically push a command, use APIcommand(APIcommand command).

To set up JavaMediawikiBot for an IDE, run ./gradlew eclipse or ./gradlew idea.
