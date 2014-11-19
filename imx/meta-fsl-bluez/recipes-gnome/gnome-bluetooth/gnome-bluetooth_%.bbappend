
DEPENDS = "${@oe.utils.conditional('PREFERRED_PROVIDER_virtual/bluez', 'bluez5', 'bluez5', 'obexd obex-data-server', d)} gnome-doc-utils-native gnome-doc-utils gconf gtk+ dbus-glib libunique libnotify virtual/bluez gnome-keyring virtual/libx11 libxi intltool-native"

RRECOMMENDS_${PN} += "${@oe.utils.conditional('PREFERRED_PROVIDER_virtual/bluez', 'bluez5', 'bluez5-obex', 'obexd obex-data-server', d)}"
