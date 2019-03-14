package rocks.zipcode;

import rocks.zipcode.controllers.*;

import org.naturalcli.*;
import org.naturalcli.commands.HelpCommand;
import rocks.zipcode.models.Id;
import rocks.zipcode.models.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class YouAreEll {


    // Create the commands
    Command getIdsCommand;
    Command getMessagesCommand;
    Command sendMessageCommand;
    Command exitCommand;

    Set<Command> cs = new HashSet<Command>();

    Boolean notDone;

    private MessageController msgCtrl;
    private IdController idCtrl;

    public YouAreEll (MessageController m, IdController j) {
        // used j because i seems awkward
        this.msgCtrl = m;
        this.idCtrl = j;
    }

    public static void main(String[] args) {

        WebTransactionsImpl xactionHandler = null;
        // hmm: notice Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(new MessageController(xactionHandler),
                new IdController(xactionHandler));
        urlhandler.initialize();

        urlhandler.runLoop();
    }

    void initialize() {
        notDone = true;
        try {
            getIdsCommand = new Command(
                    "ids",
                    "Get all the Ids",
                    new ICommandExecutor()
                    {
                        public void execute(ParseResult pr)
                        {
                            ArrayList<Id> _ids = idCtrl.getIds();
                            // now what?
                            // send to a view??
                        }
                    }
            );
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }
        // add your own...

        try {
            getMessagesCommand = new Command(
                    "messages",
                    "Get last 20 messages.",
                    new ICommandExecutor ()
                    {
                        public void execute(ParseResult pr )
                        {
                            ArrayList<Message> _msgs = msgCtrl.getMessages();
                            // now what?
                            // send to a view??
                        }
                    }
            );
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }

        try {
            sendMessageCommand = new Command(
                    "send <msg:string> ...",
                    "Send a message to the server.",
                    new ICommandExecutor ()
                    {
                        public void execute(ParseResult pr)
                        {
                            System.out.print("This is how to print out all the stuff the user typed. ");
                            for (int i= 0 ; i < pr.getParameterCount() ; i++)
                                System.out.print(pr.getParameterValue(i)+" ");
                            System.out.println();
                            // now obviously you need to hook this up to your send message machinery
                        }
                    }
            );
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }

        try {
            exitCommand = new Command(
                    "exit",
                    "Quit this program.",
                    new ICommandExecutor ()
                    {
                        public void execute(ParseResult pr)
                        {
                            System.out.println("Bye!");
                            notDone = false;
                        }
                    }
            );
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }

        cs.add(getIdsCommand);
        // add your own...
        cs.add(getMessagesCommand);
        cs.add(sendMessageCommand);
        cs.add(exitCommand);
        cs.add(new HelpCommand(cs)); // help
    }


    void runLoop() {
        // Execute
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        NaturalCLI ncli = new NaturalCLI(cs);

        while (notDone) {
            System.out.println("Command? (help for options)");
            try {
                ncli.execute(in.readLine());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // this is junk. you need to link to your Controllers.
    //
    public String getIds() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String getMessages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String mainurl, String method, String jpayload) {
        return "nada";
    }

}
