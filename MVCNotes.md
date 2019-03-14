# MVC Notes

## Models

two major entities for messages

You'll have to implement each. Use them to go from JSON to an Object and
use them throughout the rest of the code.

### View

Id: a short formatted string
Message: formatted string

Command: prompt, waiting on input

### Controllers

Command Loop: the thing that reads/writes to console

IdController
provides a list of current list of Ids seen
also a singleton ID which is the current user.

MessageListController
