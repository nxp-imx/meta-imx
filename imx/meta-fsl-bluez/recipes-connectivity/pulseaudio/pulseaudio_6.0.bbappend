BLUEZ = "${@oe.utils.conditional('PREFERRED_PROVIDER_virtual/bluez', 'bluez5', 'bluez5', 'bluez4', d)}"
PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', '${BLUEZ}', '', d)} \
                    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} \
                    ${@bb.utils.contains('DISTRO_FEATURES', 'zeroconf', 'avahi', '', d)} \
                    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '', d)}"
					
do_install_append() {
    
    sed -i '/^load-module module-native-protocol-unix/ s/$/ auth-anonymous=1/' ${D}${sysconfdir}/pulse/system.pa
    
    echo "\n### Automatically load driver modules for Bluetooth hardware" >> ${D}${sysconfdir}/pulse/system.pa    
    echo ".ifexists module-bluetooth-policy.so" >> ${D}${sysconfdir}/pulse/system.pa    
    echo "load-module module-bluetooth-policy" >> ${D}${sysconfdir}/pulse/system.pa    
    echo ".endif\n" >> ${D}${sysconfdir}/pulse/system.pa    
    echo ".ifexists module-bluetooth-discover.so" >> ${D}${sysconfdir}/pulse/system.pa    
    echo "load-module module-bluetooth-discover" >> ${D}${sysconfdir}/pulse/system.pa    
    echo ".endif\n" >> ${D}${sysconfdir}/pulse/system.pa    
    echo "load-module module-switch-on-connect" >> ${D}${sysconfdir}/pulse/system.pa    
    echo "#load-module module-alsa-sink device_id=0 tsched=true tsched_buffer_size=1048576 tsched_buffer_watermark=262144" >> ${D}${sysconfdir}/pulse/system.pa    
   
    echo "resample-method = trivial" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "enable-remixing = no" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "enable-lfe-remixing = no" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "default-sample-format = s16le" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "default-sample-rate = 48000" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "alternate-sample-rate = 24000" >> ${D}${sysconfdir}/pulse/daemon.conf
    echo "default-sample-channels = 2" >> ${D}${sysconfdir}/pulse/daemon.conf
  
}
