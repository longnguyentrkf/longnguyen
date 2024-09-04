package space.kingfu.longnguyen.core


fun String.formatEnumName() = this
    .replace(oldChar = '_', newChar = ' ')
    .lowercase()
    .replaceFirstChar { it.uppercase() }

