This readme documents how to interface to the blueooth device on both bluez4 and bluez5.

Bluez4 is the default for 3.10.53-1.1.0_GA release.

Bluez5 can be configured by adding the following lines to the local.conf.  Do a clean build.

PREFERRED_PROVIDER_virtual/bluez_mx6 = "bluez5"
VIRTUAL-RUNTIME_virtual/bluez_mx6 = "bluez5"
PREFERRED_PROVIDER_bluez-hcidump_mx6 = "bluez5"
IMAGE_INSTALL_append = " packagegroup-fsl-bluez5-tools"

Bluez4 and bluez5 have different tool sets which will be described next.

Bluez4 instructions
-------------------
1) Attach the bluetooth device. Note the ttymxc2 might need changing to ttymxc0 for sabresd boards.

	$ hciattach -n -s 921600 /dev/ttymxc2 bcsp 921600 flow & 

2) Start the bluetooth daemon
	$ bluetoothd &

3) Show the information on bluetooth device
	$ hciconifg -a

4) Scan the Bluetooth devices.   Copy the mac address of the target bluetooth device.
	$ hcitool scan

5) List the services the bluetooth device supports

	$ sdptool browse <mac address>

6) Send the file to the bluetooth device

	$ obexftp -b <mac address> -B 10 -p <file>

7) Receive the file from the bluetooth device

	$ sdptool add --chanell=10 OPUSH

Show the transfer server
	$ hciconifg -a

Start the server for receiving

	$ obexftpd -b -c . &

	Send a file from bluetooth device to the board



Bluez5 instructions
-------------------
1) Check if the bluetooth dameon is running

	$ ps aux | grep bluetoothd

2) If not, start the bluetooth daemon

	$ /usr/lib/bluez5/bluetooth/bluetoothd &

3) Check if the bluetooth interface is up

	$ hciconfig

4) If showing DOWN then enable - two possible ways

	a) $ hciconfig hciN up
                N is the device number assigned by kernel usually 0.

            if this fails with Can't init device hci0: Operation not possible due to RF-kill do the next step.

        b) $ rfkill list
                 Shows blocked try 
           $ rfkill unblock 0 
                   or 
           $rfkill unblock 1

5) Manage bluetooth with bluetoothctl. This enters an interface.  Type help to show commands

	$ bluetoothctl
	<bluetooth> scan on

	Copy mac address 
	<bluetooth> scan off
	<bluetooth> pair <mac address>
	    On bluetooth device accept paring
	<bluetooth> trust <mac address>
	<bluetooth> connect <mac address>
	<bluetooth> quit

6) Copy a file from board to bluetooth device using the obex transfer.

	Note: both obexd and obexctl need to be run from a terminal on the board
			instead of from a remote login.
			
	a) Start obex daemon
	$ /usr/lib/bluez5/bluetooth/obexd

	b) On a smart phone, install an obex app such as Bluetooth File Transfer.
	
	c) Start obexctl. Type help to show commands. 
	$ obexctl
	
	d) Start app on phone and use the connect function to connect board.
		After connection is established, obexctl should have some messages 
		showing up saying a new session has been established. The MAC address 
		of the phone should	be displayed in bracket as the command prompt.
		
	e) Send a file to phone from obexctl
	[<mac addr>]# send <file>
	
	f) Once it's done, close the session
	[<mac addr]# disconnect
	[<mac addr>]# quit

    
To setup blueZ5 and A2DP sink on SabreSD
----------------------------------------

- For details, please reference https://community.freescale.com/docs/DOC-103385

- Note: 
    1) For systems that can automatically detect the alsa cards and starts 
        pulseaudio daemon, all steps related to the 'pulse' user and starting 
        pulseaudio can be skipped. 
    2) To check if the system detected alsa card or not, run the following command
    $ ps aux | grep pulse
    
        if the output includes a process like '/usr/bin/pulseaudio --start',
        the daemon has started.
    3) After starting bluetoothd, make sure the bluetooth interface is up
        before running bluetoothctl.
        
    