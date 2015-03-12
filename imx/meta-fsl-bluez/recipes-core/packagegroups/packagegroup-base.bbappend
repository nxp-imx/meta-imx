
RDEPENDS_packagegroup-base-bluetooth = "\
    ${VIRTUAL-RUNTIME_virtual/bluez} \
    ${@bb.utils.contains('COMBINED_FEATURES', 'alsa', 'libasound-module-bluez', '',d)} \
   "

