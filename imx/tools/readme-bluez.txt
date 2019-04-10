This readme documents how to interface to the bluetooth device on bluez5.

Bluez5 is the default for 3.14 releases.

Bluez5 instructions
-------------------
1) Check that the bluetooth dameon is running.

	$ ps aux | grep bluetoothd

2) If not, start the bluetooth daemon.

	$ /usr/libexec/bluetooth/bluetoothd &

3) Check that the bluetooth interface is up.

	$ hciconfig

4) If showing DOWN then enable it - two possible ways:

	a) $ hciconfig hciN up
                N is the device number assigned by the kernel; usually 0.

            if this fails with "Can't init device hci0: Operation not possible due to RF-kill" do the next step.

        b) $ rfkill list
                 Shows blocked try 
           $ rfkill unblock 0 
                   or 
           $rfkill unblock 1

5) Manage bluetooth with bluetoothctl. This enters an interface. Type help to show commands.

	$ bluetoothctl
	<bluetooth> scan on

	Copy MAC address 
	<bluetooth> scan off
	<bluetooth> pair <mac address>
	    On bluetooth device accept pairing
	<bluetooth> trust <mac address>
	<bluetooth> connect <mac address>
	<bluetooth> quit

6) Copy a file from the board to bluetooth device using the obex transfer.

	Note: both obexd and obexctl need to be run from a terminal on the board
			instead of from a remote login.
			
	a) Start obex daemon
	$ /usr/libexec/bluetooth/obexd

	b) On a smart phone, install an obex app such as Bluetooth File Transfer.
	
	c) Start obexctl. Type help to show commands. 
	$ obexctl
	
	d) Start app on phone and use the connect function to connect to the board.
		After connection is established, obexctl should display messages 
		saying that a new session has been established. The MAC address 
		of the phone should be displayed in brackets as the command prompt.
		
	e) Send a file to phone from obexctl.
	[<mac addr>]# send <file>
	
	f) Once it's done, close the session.
	[<mac addr]# disconnect
	[<mac addr>]# quit

    
To setup blueZ5 and A2DP sink on SabreSD
----------------------------------------

- For details, please reference https://community.freescale.com/docs/DOC-103385

- Note: 
    1) For systems that can automatically detect the alsa cards and starts the
        pulseaudio daemon, all steps related to the 'pulse' user and starting 
        pulseaudio can be skipped. 
    2) To check if the system detected the alsa card or not, run the following command:
    $ ps aux | grep pulse
    
        If the output includes a process like '/usr/bin/pulseaudio --start',
        the daemon has started.
    3) After starting bluetoothd, make sure the bluetooth interface is up
        before running bluetoothctl.
