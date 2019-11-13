#!/bin/sh
if test -z "$XDG_RUNTIME_DIR"; then
	export XDG_RUNTIME_DIR=/run/user/`id -u ${WESTON_USER}`
	if ! test -d "$XDG_RUNTIME_DIR"; then
		mkdir --parents $XDG_RUNTIME_DIR
		chmod 0700 $XDG_RUNTIME_DIR
	fi
	if [ -n "$WESTON_USER" ]
	then
		chown $WESTON_USER:$WESTON_USER $XDG_RUNTIME_DIR
	fi
fi
