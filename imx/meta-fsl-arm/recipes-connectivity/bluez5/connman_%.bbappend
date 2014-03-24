PACKAGECONFIG[bluetooth] = "--enable-bluetooth, --disable-bluetooth, virtual/bluez"


RDEPENDS_${PN} = "\
	dbus \
	${@base_contains('PACKAGECONFIG', 'bluetooth', 'virtual/bluez', '', d)} \
	${@base_contains('PACKAGECONFIG', 'wifi','wpa-supplicant', '', d)} \
	${@base_contains('PACKAGECONFIG', '3g','ofono', '', d)} \
	xuser-account \
	"
