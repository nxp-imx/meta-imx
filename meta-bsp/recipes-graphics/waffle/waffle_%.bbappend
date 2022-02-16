# Add dependency on wayland-protocols
PACKAGECONFIG[wayland] = "-Dwayland=enabled,-Dwayland=disabled,virtual/${MLPREFIX}libgl wayland wayland-native wayland-protocols"
