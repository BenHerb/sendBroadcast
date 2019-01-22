using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Send.Broadcast.RNSendBroadcast
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNSendBroadcastModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNSendBroadcastModule"/>.
        /// </summary>
        internal RNSendBroadcastModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNSendBroadcast";
            }
        }
    }
}
