using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


    public class Publisher
    {
        public String Name { get; set;}
        public event EventHandler<EventArguments> ev;

        public void notify( String msg)
        {
            EventArguments args = new EventArguments(msg);

            if( ev != null)
            {
                ev(this,args);
            }

        }

    }
