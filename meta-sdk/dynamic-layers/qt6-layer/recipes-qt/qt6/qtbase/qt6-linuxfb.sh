#!/bin/sh
if test -z $XDG_RUNTIME_DIR; then
	export XDG_RUNTIME_DIR=/run/user/$(id -u)
	if [ ! -d $XDG_RUNTIME_DIR ]; then
		mkdir -m 700 -p $XDG_RUNTIME_DIR
	fi
fi
export QT_QPA_PLATFORM=linuxfb
