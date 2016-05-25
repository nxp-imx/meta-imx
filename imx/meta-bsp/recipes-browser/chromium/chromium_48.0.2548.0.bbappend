# Don't use X if it's running through Wayland

CHROMIUM_ENABLE_WAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '1', \
                      bb.utils.contains('DISTRO_FEATURES', 'x11', '0', \
                      '0', d),d)}"

# This is the workaround for the segfault when running google-chrome

PACKAGECONFIG[ignore-gpu-blacklist] = ""
PACKAGECONFIG_append = " ignore-gpu-blacklist"

CHROMIUM_EXTRA_ARGS_append = " \
	${@bb.utils.contains('PACKAGECONFIG', 'ignore-gpu-blacklist', '--ignore-gpu-blacklist', '', d)} \ 
"

# Remove packages as Chromium is changed to statically link against ffmpeg.

PACKAGES_remove = "${PN}-codecs-ffmpeg ${PN}-plugin-pdf"
