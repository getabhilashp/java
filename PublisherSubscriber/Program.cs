using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    public class Program
    {
        static void Main(string[] args)
        {
            Publisher pub1 = new Publisher();
            pub1.Name = "pub1";

            Subscriber sb1 = new Subscriber();
            Subscriber sb2 = new Subscriber();
            Subscriber sb3 = new Subscriber();
            sb1.Subscribe(pub1 );
            sb2.Subscribe(pub1);
            sb3.Subscribe(pub1);

            pub1.notify(" This is notify subscribed");
            sb2.UnSubscribe(pub1);
            pub1.notify(" This is notify all unsubscribed");
        }

    }
}