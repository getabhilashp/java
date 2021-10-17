using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


    public class EventArguments : EventArgs
    {
        public  String msg{ get; set; }
        public EventArguments(String message)
        {
            this.msg = message;
        }
        
    }
