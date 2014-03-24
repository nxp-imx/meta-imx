
# Remove --enable-dump to disable the protocol dumping for debugging
EXTRA_OECONF = "--enable-apps --enable-syslog \
                --with-usb=${STAGING_LIBDIR}/.. --with-bluez=${STAGING_LIBDIR}/.."

DEPENDS = "virtual/libusb0 virtual/bluez"


