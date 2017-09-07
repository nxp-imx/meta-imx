#!/bin/bash
#
if grep -sq ttymxc0 /proc/cmdline; then
	/sbin/getty -L ttymxc0 115200 vt100
elif grep -sq ttymxc1 /proc/cmdline; then
	/sbin/getty -L ttymxc1 115200 vt100
elif grep -sq ttymxc2 /proc/cmdline; then
	/sbin/getty -L ttymxc2 115200 vt100
elif grep -sq ttymxc3 /proc/cmdline; then
	/sbin/getty -L ttymxc3 115200 vt100
else
	sleep 100000
fi
