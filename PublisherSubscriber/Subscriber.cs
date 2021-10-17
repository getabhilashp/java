using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


    public class Subscriber
    {
        
        public void Subscribe( Publisher pub)
        {
            pub.ev += Update;

        }
        public void UnSubscribe( Publisher pub)
        {
            pub.ev -= Update;
        }
        public void Update( object sender, EventArguments args)
        {
            Publisher pub = (Publisher) sender;
            Console.WriteLine(pub.Name + "sent a message :"  +args.msg);

        }


    }
