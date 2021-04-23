#!/bin/sh

# Set XDG_RUNTIME_DIR manually.
# The variable is not set for ssh login, causing app failures. It's not clear
# if this is an error or by design, but setting it manually does help and
# doesn't seem to hurt...
if test -z "$XDG_RUNTIME_DIR"; then
	export XDG_RUNTIME_DIR=/run/user/`id -u`
fi
