# MVC Notes

## Models

two major entities for messages

Id post/get of Id and list

Message
POST/GET/LIST of messages

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
