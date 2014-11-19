
RDEPENDS_${PN} = "\
	dbus \
	${@base_contains('PACKAGECONFIG', 'bluetooth', 'VIRTUAL-RUNTIME_virtual/bluez', '', d)} \
	${@base_contains('PACKAGECONFIG', 'wifi','wpa-supplicant', '', d)} \
	${@base_contains('PACKAGECONFIG', '3g','ofono', '', d)} \
	xuser-account \
	"
	
PACKAGECONFIG[bluetooth] = "--enable-bluetooth, --disable-bluetooth, virtual/bluez"
